package com.compaines.solutions.domain.entity;


import com.compaines.solutions.domain.entity.user.factory.UserCustomFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class UserTest {

    String name = "Lucas";
    String email = "fariaa@hotmail.com";

    @Test
    @DisplayName("Teste para validar nome e email de um usuário")
    public void shouldCreateUserWithNameAndEmail(){
        UserCustomFactory factory = new UserCustomFactory();
        User lucas = factory.create(name, email);

        assertThat(lucas.getName()).isEqualTo(name);
        assertThat(lucas.getEmail()).isEqualTo(email);
    }
}
