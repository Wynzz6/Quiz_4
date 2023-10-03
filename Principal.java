

import java.util.Date;

    public class Principal {
        public static void main(String[] args) {
            Date fechaNacimientoMario = new Date(2006, 3, 17);

            Date fechaNacimientoAndres = new Date(2005, 11, 25);

            estudiante.Estudiante mario = new estudiante.Estudiante("Mario", fechaNacimientoMario);

            estudiante.Estudiante andres = new estudiante.Estudiante("Andres", fechaNacimientoAndres);

            System.out.println("Nombre del estudiante: " + mario.getNombre());

            mario.setNotadeMateria1(4.0);
            mario.setNotadeMateria2(4.0);
            mario.setNotadeMateria3(4.5);

            System.out.println("La nota numero 1 es: " + mario.getNotadeMateria1());

            System.out.println("La nota numero 2 es: " + mario.getNotadeMateria2());

            System.out.println("La nota numero 3 es: " + mario.getNotadeMateria3());

            double promedio = (mario.getNotadeMateria1() + mario.getNotadeMateria2() + mario.getNotadeMateria3()) / 3.0;

            System.out.println("El promedio de esta clase es: " + promedio);



            System.out.println("Nombre del estudiante: " + andres.getNombre());

            andres.setNotadeMateria1(4.7);
            andres.setNotadeMateria2(4.0);
            andres.setNotadeMateria3(4.3);

            System.out.println("Nota numero 1 es: " + andres.getNotadeMateria1());

            System.out.println("Nota numero 2 es: " + andres.getNotadeMateria2());

            System.out.println("Nota numero 3 es: " + andres.getNotadeMateria3());

            double promedio2 = (andres.getNotadeMateria1() + andres.getNotadeMateria2() + andres.getNotadeMateria3()) / 3.0;

            System.out.println("El promedio de esta clase es: " + promedio2);
}
        }
