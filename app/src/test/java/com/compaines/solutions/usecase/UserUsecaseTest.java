package com.compaines.solutions.usecase;

import com.compaines.solutions.domain.entity.User;
import com.compaines.solutions.usecase.user.UserUseCase;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserUsecaseTest {

    String name = "Lucas";
    String email = "fariaa@hotmail.com";

    @Test
    @DisplayName("Registra usuário com um nome e email válido")
    public void shouldRegisterUserWithNameAndEmail(){
        UserUseCase userUsecase = new UserUseCase();
        User user = userUsecase.register(name, email);

        assertThat(name).isEqualTo(user.getName());
        assertThat(email).isEqualTo(user.getEmail());
    }

}
