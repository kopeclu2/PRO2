package students;

import sun.net.www.content.text.Generic;

import java.util.*;

class First {
	private static Random random = new Random();
	private static Scanner input = new Scanner(System.in);
	
	//DU: pridat do tridy Time metodu compareTo, 
	//  ktera bude vracet cele cislo,
	//  bude mit parametr typu Time 
	//  a pro a, b typu Time bude platit:
	//  a je driv nez b, pak a.compareTo(b) < 0
	//  a je stejny cas jako b, pak a.compareTo(b) == 0
	//	a je pozdeji nez b, pak a.compareTo(b) > 0

	//A: vypocet minut od zacatku dne z hodiny od zacatku dne
	// 	 a minuty od zacatku hodiny
	//I: hodina od zacatku dne, minuta od zacaku dne
	//O: pocet minut od zacatku dne

	       //O:    //A:      //I:
	static int timeInMinutes(final int hour, final int minute) {
		return hour * 60 + minute;
	}

	//A: vypis studenta
	//I: promenne s udaji o studentovi
	//O: vypis v konzoli = side effect => typ navratove hodnoty void

	       //O:	       //A:		    //I:
	static void/*FUJ*/ printStudent(final Student student) {
		final Time time = student.getTime();
		System.out.println("Jmeno: " + student.getFirstName() +
				"\nPrijmeni: " + student.getSurname() +
				"\nCas: " + time.getHour() + ":" + time.getMinute()
		);
	}

	static Student loadStudent(final String studentOrdinal) {
		System.out.println("Zadej udaje " + studentOrdinal + " studenta");
		System.out.println("Zadej krestni jmeno:");
		String firstName = input.next();
		System.out.println("Zadej prijmeni:");
		String surname = input.next();
		System.out.println("Zadej hodinu:");
		int hour = input.nextInt();
		System.out.println("Zadej minutu:");
		int minute = input.nextInt();
		return new Student(firstName, surname, new Time(hour, minute));
	}

	public static void main(String[] args) {
		//A: Nacist od uzivatele udaje o dvou studentech
		//	 (jmeno, prijmeni, hodina, minuta)
		//I: udaje od uzivatele
		//O: promenne naplnene hodnotami

		final ClassroomLinked classroom =
				new ClassroomLinked()
				.add(loadStudent("prvniho"))
				.add(loadStudent("druheho"))
				.add(loadStudent("tretiho"));

		//A: print students
		try {
			printStudent(classroom.get(0));
			printStudent(classroom.get(1));
			printStudent(classroom.get(2));
		} catch (InvalidIndexException e) {
			e.printStackTrace();
		}
			System.out.println("s");

		//A: Zjistit, ktery student odevzdal pozdeji
		//I: Promenne z predchoziho algoritmu
		//O: Promenne s vysledkem (udaji studenta)

		final Student student = classroom.getSlowestStudent(); //O:

		//A: vypis studenta
		//I: promenne s udaji o studentovi
		//O: vypis v konzoli
		System.out.println("==== posledni odevzdal ====");
		printStudent(student);
	}

}
