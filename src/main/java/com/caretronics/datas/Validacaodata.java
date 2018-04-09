package com.caretronics.datas;

public class Validacaodata {

	List<Integer> mesesCom30Dias = new ArrayList<Integer>();
	List<Integer> mesesCom31Dias = new ArrayList<Integer>();
	public void Verifica(int dia, int mes, int ano){  
		populaMeses();
		if(ano >= 1900 && ano <= 2010){ 
			validarMesCom31Dias(dia, mes);
			validarMesCom30Dias(dia, mes);  
			validarAnoBissexto(dia, mes, ano);
		}
	}
	private void populaMeses() {
		mesesCom30Dias.add(4);
		mesesCom30Dias.add(6);
		mesesCom30Dias.add(9);
		mesesCom30Dias.add(11);
		mesesCom31Dias.add(1);
		mesesCom31Dias.add(3);
		mesesCom31Dias.add(5);
		mesesCom31Dias.add(7);
		mesesCom31Dias.add(8);
		mesesCom31Dias.add(10);
		mesesCom31Dias.add(12);
	}
	private void validarAnoBissexto(int dia, int mes, int ano) {
		if(mes==2){
			if( ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
				if(dia < 1 && dia > 29){
					throw new IllegalArgumentException("Data inválida");
				}
			}else{
				if(dia < 1 && dia > 28){
					throw new IllegalArgumentException("Data inválida");
				} 
			}
		}
	}
	private void validarMesCom30Dias(int dia, int mes) {
		if( mesesCom30Dias.contains(mes)){  
			if(dia < 1 && dia > 30){
				throw new IllegalArgumentException("Data inválida");
			}
		}
	}
	private void validarMesCom31Dias(int dia, int mes) {
		if(mesesCom31Dias.contains(mes)){  
			if(dia < 1 && dia > 31){
				throw new IllegalArgumentException("Data inválida");
			}  
		}
	}

mspereira
Abr '10

Bom, primeiro que o construtor que v
	
	
}
