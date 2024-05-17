package com.senac.pi1.pizza;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record Cliente(
                String nome,
                int telefone,
                String endereco,
                int cep) {

        public List<String> converterEmLista() {
                return List.of(
                        nome,
                        "" + telefone,
                        endereco,
                        "" + cep
                );
        }

        public static Cliente lerCliente(List<String> listinha) {
                return new Cliente(
                        listinha.get(0),
                        Integer.parseInt(listinha.get(1)),
                        listinha.get(2),
                        Integer.parseInt(listinha.get(3))
                );
        }

        public static List<String> converterEmListas(List<Cliente> clientes) {
                List<String> listona = new ArrayList<>();
                for (var p : clientes) {
                        var listinha = p.converterEmLista();
                        listona.addAll(listinha);
                }
                return listona;
        }

        public static List<Cliente> lerClientes(List<String> listona) {
                List<Cliente> tudo = new ArrayList<>();
                for (var i = 0; i < listona.size(); i += 4) {
                        List<String> listinha = listona.subList(i, i + 4);
                        var Cliente = lerCliente(listinha);
                        tudo.add(Cliente);
                }
                return tudo;
        }

        public static List<Cliente> buscarPorNome(List<Cliente> tudo, String nome) {
                List<Cliente> achei = new ArrayList<>();
                for (var v : tudo) {
                    if (v.nome().equalsIgnoreCase(nome)) achei.add(v);
                }
                return achei;
        }

        public static Optional<Cliente> buscarPorTelefone(List<Cliente> tudo, int telefone) {
                for (var v : tudo) {
                    if (v.telefone() == telefone) return Optional.of(v);
                }
                return Optional.empty();
        }
}
