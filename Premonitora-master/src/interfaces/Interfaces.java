package interfaces;

import java.util.List;

/*
* @author Fellipe Henrique Nogueira Fernandes Caluête
* @version 1.0
*/

// Interface definindo operações básicas de CRUD para o Perfil
public interface Interfaces {
    // Cria um novo perfil
    void criar(model.Perfil perfil);
    // Lê perfil pelo CPF
    model.Perfil ler(String cpf);
    // Atualiza um perfil existente
    void atualizar(model.Perfil perfil);
    // Remove perfil pelo CPF
    void deletar(String cpf);
    // Retorna lista de todos os perfis
    List<model.Perfil> listarTodos();
}
