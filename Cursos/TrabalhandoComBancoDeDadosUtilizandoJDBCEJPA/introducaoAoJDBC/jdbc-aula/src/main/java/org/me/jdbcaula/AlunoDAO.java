package org.me.jdbcaula;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {
    
    public List<Aluno> list(){

        List<Aluno> alunos = new ArrayList<>();

        try (Connection connection = ConnectionJDBC.getConnection()){
            
            PreparedStatement consulta = connection.prepareStatement("select * from aluno");

            ResultSet resultado = consulta.executeQuery();

            while(resultado.next()){

                Aluno aluno = new Aluno(resultado.getInt("id"), resultado.getString("nome"), resultado.getInt("idade"), resultado.getString("estado"));

                alunos.add(aluno);
            }
            
        } catch (Exception e) {
            

        }

        return alunos;
    }

    public Aluno getById(int id){
        Aluno aluno = new Aluno();

        try (Connection connection = ConnectionJDBC.getConnection()){

            String sql = "select * from aluno where id = ?";
            
            PreparedStatement consulta = connection.prepareStatement(sql);
            consulta.setInt(1, id);

            ResultSet resultado = consulta.executeQuery();

            if(resultado.next()){

                aluno.setId(id);
                aluno.setEstado(resultado.getString("estado"));
                aluno.setIdade(resultado.getInt("idade"));
                aluno.setNome(resultado.getString("nome"));
            }
            
        } catch (Exception e) {
            

        }

        return aluno;
    }

    public void insert(Aluno aluno){

        try (Connection connection = ConnectionJDBC.getConnection()){

            String sql = "insert into aluno(nome, idade, estado) values(?, ?, ?)";
            
            PreparedStatement consulta = connection.prepareStatement(sql);

            consulta.setString(1, aluno.getNome());
            consulta.setInt(2, aluno.getIdade());
            consulta.setString(3, aluno.getEstado());

            // retorna o número de linhas afetadas
            int resultado = consulta.executeUpdate();

            System.out.println("Linhas afetadas: %d" + resultado);
            
        } catch (Exception e) {
            
            
        } 
    }

    public void delete(int id){

        try (Connection connection = ConnectionJDBC.getConnection()){

            String sql = "delete from aluno where id = ?";
            
            PreparedStatement consulta = connection.prepareStatement(sql);

            consulta.setInt(1, id);

            int resultado = consulta.executeUpdate();

            System.out.println("Linhas afetadas: %d" + resultado);
            
        } catch (Exception e) {
            
            
        } 
    }

    public void update(Aluno aluno){

        try (Connection connection = ConnectionJDBC.getConnection()){

            String sql = "update aluno set nome = ?, idade = ?, estado = ? where id = ?";
            
            PreparedStatement consulta = connection.prepareStatement(sql);

            consulta.setString(1, aluno.getNome());
            consulta.setInt(2, aluno.getIdade());
            consulta.setString(3, aluno.getEstado());
            consulta.setInt(4, aluno.getId());

            int resultado = consulta.executeUpdate();

            System.out.println("Linhas afetadas: %d" + resultado);
            
        } catch (Exception e) {
            
            
        } 
    }
}
