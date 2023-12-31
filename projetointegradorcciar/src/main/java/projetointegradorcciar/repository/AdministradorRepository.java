package projetointegradorcciar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import projetointegradorcciar.entity.Administrador;

import java.util.Optional;

public interface AdministradorRepository extends JpaRepository <Administrador,Long>{
    Administrador findByCpf(String cpf);
    Optional<Administrador> findOneByEmailAndSenha(String email, String senha);
    Administrador findByEmail (String email);
}
