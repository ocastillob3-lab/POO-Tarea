package Encapsulacion;

	// ===== CLASE PERSONA =====
	class Persona {
	    private String nombre;
	    private String apellido;
	    private int edad;

	    public Persona(String nombre, String apellido, int edad) {
	        this.nombre = nombre;
	        this.apellido = apellido;
	        this.edad = edad;
	    }

	    public void mostrar() {
	        System.out.println("Nombre: " + nombre + " " + apellido + ", Edad: " + edad);
	    }
	}

	// ===== CLASE RECTANGULO =====
	class Rectangulo {
	    private double base;
	    private double altura;

	    public Rectangulo(double base, double altura) {
	        this.base = base;
	        this.altura = altura;
	    }

	    public double area() {
	        return base * altura;
	    }

	    public double perimetro() {
	        return 2 * (base + altura);
	    }
	}

	// ===== CLASE PRODUCTO =====
	class Producto {
	    private String codigo;
	    private String nombre;
	    private double precio;

	    public Producto(String codigo, String nombre, double precio) {
	        this.codigo = codigo;
	        this.nombre = nombre;
	        this.precio = precio;
	    }

	    public void aplicarDescuento(double porcentaje) {
	        precio -= precio * (porcentaje / 100);
	    }

	    public void mostrar() {
	        System.out.println("Producto: " + nombre + ", Precio: " + precio);
	    }
	}

	// ===== CLASE CUENTA =====
	class Cuenta {
	    private String titular;
	    private double saldo;

	    public Cuenta(String titular, double saldo) {
	        this.titular = titular;
	        this.saldo = saldo;
	    }

	    public void depositar(double monto) {
	        saldo += monto;
	    }

	    public void retirar(double monto) {
	        if (saldo - monto >= 0) {
	            saldo -= monto;
	        } else {
	            System.out.println("Saldo insuficiente");
	        }
	    }

	    public void mostrar() {
	        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
	    }
	}

	// ===== CLASE LIBRO =====
	class Libro {
	    private String titulo;
	    private String autor;
	    private int paginas;

	    public Libro(String titulo, String autor, int paginas) {
	        this.titulo = titulo;
	        this.autor = autor;
	        this.paginas = paginas;
	    }

	    public boolean esLargo() {
	        return paginas > 300;
	    }

	    public void mostrar() {
	        System.out.println(titulo + " -> " + (esLargo() ? "Largo" : "Corto"));
	    }
	}

	// ===== CLASE CALCULADORA =====
	class Calculadora {

	    public double sumar(double a, double b) {
	        return a + b;
	    }

	    public double restar(double a, double b) {
	        return a - b;
	    }

	    public double multiplicar(double a, double b) {
	        return a * b;
	    }

	    public double dividir(double a, double b) {
	        if (b == 0) {
	            System.out.println("Error: división entre cero");
	            return 0;
	        }
	        return a / b;
	    }
	}

	// ===== CLASE FECHA =====
	class Fecha {
	    private int dia;
	    private int mes;
	    private int anio;

	    public Fecha(int dia, int mes, int anio) {
	        this.dia = dia;
	        this.mes = mes;
	        this.anio = anio;
	    }

	    public boolean esValida() {
	        return (dia >= 1 && dia <= 31) && (mes >= 1 && mes <= 12);
	    }

	    public void mostrar() {
	        System.out.println(dia + "/" + mes + "/" + anio + " -> " + (esValida() ? "Válida" : "Inválida"));
	    }
	}

	// ===== CLASE PRINCIPAL =====
	public class Main {
	    public static void main(String[] args) {

	        System.out.println("=== PERSONAS ===");
	        Persona p1 = new Persona("Juan", "Perez", 20);
	        Persona p2 = new Persona("Ana", "Lopez", 25);
	        Persona p3 = new Persona("Luis", "Garcia", 30);
	        p1.mostrar();
	        p2.mostrar();
	        p3.mostrar();

	        System.out.println("\n=== RECTÁNGULOS ===");
	        Rectangulo r1 = new Rectangulo(5, 3);
	        Rectangulo r2 = new Rectangulo(4, 6);
	        System.out.println("Área r1: " + r1.area());
	        System.out.println("Área r2: " + r2.area());

	        if (r1.area() > r2.area()) {
	            System.out.println("r1 tiene mayor área");
	        } else {
	            System.out.println("r2 tiene mayor área");
	        }

	        System.out.println("\n=== PRODUCTOS ===");
	        Producto prod1 = new Producto("001", "Laptop", 5000);
	        Producto prod2 = new Producto("002", "Mouse", 150);
	        prod1.aplicarDescuento(10);
	        prod2.aplicarDescuento(20);
	        prod1.mostrar();
	        prod2.mostrar();

	        System.out.println("\n=== CUENTA ===");
	        Cuenta cuenta = new Cuenta("Carlos", 1000);
	        cuenta.depositar(500);
	        cuenta.retirar(300);
	        cuenta.retirar(1500);
	        cuenta.mostrar();

	        System.out.println("\n=== LIBROS ===");
	        Libro l1 = new Libro("Libro A", "Autor 1", 250);
	        Libro l2 = new Libro("Libro B", "Autor 2", 350);
	        Libro l3 = new Libro("Libro C", "Autor 3", 500);
	        l1.mostrar();
	        l2.mostrar();
	        l3.mostrar();

	        System.out.println("\n=== CALCULADORA ===");
	        Calculadora calc = new Calculadora();
	        System.out.println("Suma: " + calc.sumar(10, 5));
	        System.out.println("Resta: " + calc.restar(10, 5));
	        System.out.println("Multiplicación: " + calc.multiplicar(10, 5));
	        System.out.println("División: " + calc.dividir(10, 0));

	        System.out.println("\n=== FECHAS ===");
	        Fecha f1 = new Fecha(10, 5, 2023);
	        Fecha f2 = new Fecha(32, 1, 2023);
	        Fecha f3 = new Fecha(15, 13, 2023);
	        f1.mostrar();
	        f2.mostrar();
	        f3.mostrar();
	    }
	}