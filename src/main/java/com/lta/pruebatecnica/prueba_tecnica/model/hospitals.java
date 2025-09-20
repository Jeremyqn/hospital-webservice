package com.lta.pruebatecnica.prueba_tecnica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class hospitals {
    private int id;
    private String name;
    private String address;
    private String phone;
    private String email;
    private String website;

}
