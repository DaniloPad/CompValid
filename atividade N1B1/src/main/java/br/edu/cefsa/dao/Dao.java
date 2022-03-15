package br.edu.cefsa.dao;

import br.edu.cefsa.model.Cargo;
import br.edu.cefsa.model.Departamento;
import br.edu.cefsa.model.Funcionario;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.nio.charset.StandardCharsets.UTF_16;
import static java.nio.file.Files.lines;

public class Dao {

    private Long codigoFuncionario = 0L;

    public List<Funcionario> lerTxt() {
        Path path = Path.of("dados.txt");

        try (Stream<String> dados = lines(path)) {
            return dados.map(this::getFuncionario).collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }

    private Funcionario getFuncionario(String linha) {

        codigoFuncionario++;

        String[] separado = linha.split(";");

        String nome = separado[0];

        Long codigoCargo = Long.valueOf(separado[1].substring(0, 1));

        String profissao = separado[1].substring(1).strip();

        Long departamentoCodigo = Long.valueOf(separado[2].substring(0, 1));

        String departamento = separado[2].substring(1).strip();

        LocalDate data = LocalDate.parse(separado[3]);

        LocalDateTime dataHora = LocalDateTime.parse(separado[4].replace(" ", "T"));

        Cargo cargo = new Cargo(codigoCargo, profissao);

        Departamento departamentoFuncionario = new Departamento(departamentoCodigo, departamento);

        return new Funcionario(codigoFuncionario, nome, data, dataHora, cargo, departamentoFuncionario);

    }

    public void salvaEmArquivoDb(List<Funcionario> lista) {
        Path caminho = Paths.get("objetos.db");
        List<String> listaDeString = lista.stream().map(Object::toString).collect(Collectors.toList());
        try {
            Files.write(caminho, listaDeString, UTF_16);
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
}
