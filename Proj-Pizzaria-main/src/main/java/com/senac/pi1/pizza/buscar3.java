package com.senac.pi1.pizza;

import java.util.List;
import java.util.Optional;

public class buscar3 {
    public static Optional<Cliente> buscar3(List<Cliente> tudo, String nome) {
        for (var v : tudo) {
            if (v.nome().equals(nome)) return Optional.of(v);
        }
        return Optional.empty();
    }

}