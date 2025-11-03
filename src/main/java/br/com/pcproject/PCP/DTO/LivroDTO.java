package br.com.pcproject.PCP.DTO;

import lombok.*;
import java.util.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Getter
@Setter
public class LivroDTO {

    @NotEmpty(message = "Name required")
    private String name;

    @NotEmpty(message = "Author required")
    private String Author;

    @NotEmpty(message = "Image required")
    private byte[] image;

    @NotNull(message = "Price required")
    private Float price;

    @NotNull(message = "Quantity required")
    private Integer quantity;



}
