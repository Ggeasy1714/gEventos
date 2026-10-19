package gEventos.Api.DTO;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
// class created cuz the last class that were given in uni at 19/10/2026
public record ClienteRequest(
        @NotBlank
        @Size(max = 100)
        String nome,
        
        @NotNull
        @DecimalMin("0.00")
        BigDecimal idade
) {}
