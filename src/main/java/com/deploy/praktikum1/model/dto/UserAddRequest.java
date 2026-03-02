package com.deploy.praktikum1.model.dto;

package com.deploy.praktikum1.model.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserAddRequest {
    @NotBlank
    private String name;

    @NotNull
    private int age;
}