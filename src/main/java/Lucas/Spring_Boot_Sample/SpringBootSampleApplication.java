package Lucas.Spring_Boot_Sample;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import Lucas.Spring_Boot_Sample.model.Aluno;
import Lucas.Spring_Boot_Sample.model.Contato;
import Lucas.Spring_Boot_Sample.model.Curso;
import Lucas.Spring_Boot_Sample.model.Departamento;
import Lucas.Spring_Boot_Sample.model.Endereco;
import Lucas.Spring_Boot_Sample.model.Turma;
import Lucas.Spring_Boot_Sample.model.support_classes.Periodo;
import Lucas.Spring_Boot_Sample.repository.AlunoDao;


@SpringBootApplication
public class SpringBootSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner run(AlunoDao dao) throws Exception{
		return args ->{
			Aluno a = new Aluno();
			a.setNome("Luciane");
			a.setSobrenome("de Alameda");
			a.setCpf("27745676523499");
			a.setRg("505651336");
			
			Contato c = new Contato();
			c.setCelular(11987654556l);
			c.setEmail("Paulinha.ala@gmail.com");
			a.setContato(c);
			
			Endereco e = new Endereco();
			e.setLogradouro("Avenida das americas");
			e.setNumero(2l);
			e.setBairro("carrão");
			e.setCidade("são paulo");
			e.setEstado("SP");
			e.setCep("12354609");
			a.setEndereco(e);
			
			Curso cu = new Curso();
			cu.setNome("direito");
			Departamento dep = new Departamento();
			dep.setFuncoes("humanas");
			cu.setDepartamento(dep);
			Curso cu2 = new Curso();
			cu2.setDepartamento(dep);
			cu2.setNome("direito");
			
			Turma tur = new Turma();
			tur.setNome("H2");
			tur.setPeriodo(Periodo.N);
			tur.setNumAluno(45l);
			LocalDate dateI = LocalDate.of(2020, 1, 12);
			tur.setDataInicio(dateI);
			cu.setTurma(tur);

			a.setCurso(cu);
			a.setTurma(tur);
			
			dao.save(a);
		};
		
	} 
}
