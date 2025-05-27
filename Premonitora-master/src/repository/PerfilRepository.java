package repository;

import model.Perfil;

/*
 * @author Fellipe Henrique Nogueira Fernandes Caluête
 * @version 1.0
 */

import interfaces.Interfaces;
import java.util.ArrayList;
import java.util.List;

public class PerfilRepository implements Interfaces {

    private List<Perfil> perfis = new ArrayList<>();

    @Override
    public void criar(Perfil perfil) {
        perfis.add(perfil);
    }

    @Override
    public Perfil ler(String cpf) {
        for (Perfil p : perfis) {
            if (p.getCpf().equals(cpf)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void atualizar(Perfil perfilAtualizado) {
        for (int i = 0; i < perfis.size(); i++) {
            if (perfis.get(i).getCpf().equals(perfilAtualizado.getCpf())) {
                perfis.set(i, perfilAtualizado);
                break;
            }
        }
    }

    @Override
    public void deletar(String cpf) {
        perfis.removeIf(p -> p.getCpf().equals(cpf));
    }

    @Override
    public List<Perfil> listarTodos() {
        return perfis;
    }
}
