package com.akshay.ecommerce.controller;

import com.akshay.ecommerce.model.Product;
import com.akshay.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts() , HttpStatus.OK);
    }

    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        Product product = productService.getProductById(id);

        if (product != null)
            return ResponseEntity.ok(product);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product ,
                                        @RequestPart MultipartFile imageFile) {
        try {
            System.out.println("In add product Controller");
            Product product1 = productService.addProduct(product , imageFile);
            return ResponseEntity.ok().body(product1);
        }catch (Exception e) {
            return ResponseEntity.internalServerError().body(e.getMessage());
        }
    }

    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getImageByProductId(@PathVariable int productId) {

        Product product = productService.getProductById(productId);
        return ResponseEntity.ok()
                .contentType(MediaType.valueOf(product.getImageType()))
                .body(product.getImageData());
    }

    @PutMapping("/product/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable int productId ,
                                                @RequestPart Product product ,
                                                @RequestPart MultipartFile imageFile) {
        try {
            productService.updateProduct(productId , product , imageFile);
            return ResponseEntity.ok()
                    .body("product update");
        } catch (IOException e) {
            return ResponseEntity.badRequest()
                    .body("product not updated")
        }

    }
}
