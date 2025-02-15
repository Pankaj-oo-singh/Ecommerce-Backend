package com.BackendEcommerce.auth.controller;

import com.BackendEcommerce.auth.entities.Authority;
import com.BackendEcommerce.auth.service.AuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/authorities")
public class AuthorityController {

    @Autowired
    private AuthorityService authorityService;

    @PostMapping
    public ResponseEntity<Authority> createAuthority(@RequestParam String role, @RequestParam String description) {
        Authority authority = authorityService.createAuthority(role, description);
        return ResponseEntity.status(HttpStatus.CREATED).body(authority);
    }
}
