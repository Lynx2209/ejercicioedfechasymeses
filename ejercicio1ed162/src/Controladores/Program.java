package Controladores;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Program {

	public static void main(String[] args) {
		ZonedDateTime fechaHoy = ZonedDateTime.now(ZoneId.of("Europe/Madrid"));
		
		int dia = fechaHoy.getDayOfMonth();
		int mes = fechaHoy.getMonthValue();
		int anyo = fechaHoy.getYear();
		int hora = fechaHoy.getHour();
		int minutos = fechaHoy.getMinute();
		int segundos = fechaHoy.getSecond();
		int diaDeLaSemana = fechaHoy.getDayOfWeek().getValue(); 
		int diaDelAño = fechaHoy.getDayOfYear();
		System.out.println(dia);
		System.out.println(mes);
		System.out.println(anyo);
		System.out.println(hora);
		System.out.println(minutos);
		System.out.println(segundos);
		System.out.println(diaDeLaSemana);
		System.out.println(diaDelAño);
	}

}