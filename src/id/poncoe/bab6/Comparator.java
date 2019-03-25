package id.poncoe.bab6;

/**
 *
 * @author poncoe
 */

// Sorting Comparator menggunakan Arraylist

import java.util.ArrayList; 
import java.util.Collections; 
import java.util.Iterator; 
import java.util.List; 
import java.util.Comparator; 

class Student { 

	// inisialisasi Variabel 
	String Name; 
	int Age; 

	// membuat konstruktor student 
	public Student(String Name, Integer Age) { 
		this.Name = Name; 
		this.Age = Age; 
	} 

	public String getName() { 
		return Name; 
	} 

	public void setName(String Name) { 
		this.Name = Name; 
	} 

	public Integer getAge() { 
		return Age; 
	} 

	public void setAge(Integer Age) { 
		this.Age = Age; 
	} 

	// overriding toString() method 
	@Override
	public String toString() { 
		return "Customer{" + "Name=" + Name + ", Age=" + Age + '}'; 
	} 

	static class CustomerSortingComparator implements Comparator<Student> { 

		@Override
		public int compare(Student customer1, Student customer2) { 

		// untuk perbandingan 
		int NameCompare = customer1.getName().compareTo(customer2.getName()); 
		int AgeCompare = customer1.getAge().compareTo(customer2.getAge()); 

			// membuat 2 kondisi perbandingan menggunakan If dan Else 
			if (NameCompare == 0) { 
				return ((AgeCompare == 0) ? NameCompare : AgeCompare); 
			} else { 
				return NameCompare; 
			} 
		} 
	} 

	public static void main(String[] args) { 

		// buat ArrayList untuk menyimpan Student
		List<Student> al = new ArrayList<>(); 

		// membuat objek student menggunakan inisialisasi konstruktor 
		Student obj1 = new Student("Ajay", 27); 
		Student obj2 = new Student("Sneha", 23); 
		Student obj3 = new Student("Simran", 37); 
		Student obj4 = new Student("Ajay", 22); 
		Student obj5 = new Student("Ajay", 29); 
		Student obj6 = new Student("Sneha", 22); 

		// menambahkan objek student kedalam arraylist 
		al.add(obj1); 
		al.add(obj2); 
		al.add(obj3); 
		al.add(obj4); 
		al.add(obj5); 
		al.add(obj6); 

		// sebelum Menyortir daftar array: beralih menggunakan Iterator 
		Iterator<Student> custIterator = al.iterator(); 

		System.out.println("Before Sorting:\n"); 
		while (custIterator.hasNext()) { 
			System.out.println(custIterator.next()); 
		} 

		// sorting menggunakan Collections.sort(al, comparator); 
		Collections.sort(al, new CustomerSortingComparator()); 

		// setelah Sorting arraylist: iterate menggunakan for-loop yang disempurnakan 
		System.out.println("\n\nAfter Sorting:\n"); 
		for (Student customer : al) { 
			System.out.println(customer); 
		} 
	} 
}
