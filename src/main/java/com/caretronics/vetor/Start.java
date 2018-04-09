package com.caretronics.vetor;

public class Start {
	
	private int totalCursos = 0;
	
	public static void main(String[] args) {

	       AlunoPrivado aluno = new AlunoPrivado();
	       aluno.setNome("Joao");
	       aluno.setCursos("matemática");
	    }
	
	@Override
	public void addCurso(String curso) {
	    if (totalCursos == 5) {
	        throw Exception("Quantidade de cursos chegou ao limite");
	    }
	    cursos[totalCursos] = curso;
	    totalCursos++;
	}
	@Override
	public void addCursos(String cursos, String listaCursos[]) {
	    if (totalCursos > 5 - cursos.length()) {
	        throw new Exception("Quantidade de cursos chegou ao limite");
	    }
	    for(String curso : listaCursos){
	        cursos[totalCursos ] = curso;
	        totalCursos++;
	    }
	}
	
	public Boolean addCurso(String curso, int curso1) {
	    if (totalCursos == 5) {
	        return false;
	    }
	    String[] cursos;
		cursos[totalCursos] = curso;
	    totalCursos++;
	    return true;
	}
	
	public void listCursos() {
	    for(String curso : cursos) {
	        System.out.println(curso);
	    }
	}
	
	
	public boolean changeCurso(String cursoModificar, String cursoNovo) {
	    for(String curso : cursos) {
	        if (curso.equals(cursoModificar)) {
	            curso = cursoNovo;
	            return true;
	        }
	    }
	    return false;
	}
	
	public boolean changeCurso(int cursoModificar, String cursoNovo) {
	    if (cursoModificar < 0 || cursoModificar > totalCursos - 1) {
	        return false;
	    }
	    cursos[cursoModificar] = cursoNovo;
	    return true;
	}
	
	
	public boolean removeUltimoCurso() {
	    if (totalCursos == 0) {
	        return false;
	    }
	    cursos[totalCursos - 1] = null;
	    totalCursos--;
	    return true;
	}

	public boolean removeTodosCursos() {
	    cursos = new String[5];
	    return true;
	}
	
	public void setCursos(String ... novosCursos){
	    int i = 0;
	    for(String curso : novosCursos){
	        cursos[i] = curso;
	        i++;
	    }
	}
	
	
}
