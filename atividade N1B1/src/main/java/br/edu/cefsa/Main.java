package br.edu.cefsa;


import br.edu.cefsa.dao.Dao;
import br.edu.cefsa.model.Funcionario;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Dao dao = new Dao();

        List<Funcionario> funcionarios = dao.lerTxt();

        dao.salvaEmArquivoDb(funcionarios);
    }

}
