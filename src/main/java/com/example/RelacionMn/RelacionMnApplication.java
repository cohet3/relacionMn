package com.example.RelacionMn;

import com.example.RelacionMn.modelo.autobuses.Autobuse;
import com.example.RelacionMn.modelo.autobuses.Conductore;
import com.example.RelacionMn.modelo.autobuses.Lugar;
import com.example.RelacionMn.modelo.autobuses.Visita;
import com.example.RelacionMn.servicio.IAutobusServicio;
import com.example.RelacionMn.servicio.IConductorServicio;
import com.example.RelacionMn.servicio.ILugarServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class RelacionMnApplication implements CommandLineRunner {
	@Autowired
	private IAutobusServicio autobusServicio;
	@Autowired
	private IConductorServicio conductorServicio;
	@Autowired
	private ILugarServicio lugarServicio;

	public static void main(String[] args) {
		SpringApplication.run(RelacionMnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Autobuse a1= new Autobuse("1234ABC", 2020);
		Visita v1 = new Visita(0, LocalDate.now());
		Visita v2 = new Visita(0, LocalDate.now());
		Lugar l1 = new Lugar(0, "Las Vegas");
		Conductore c1 = new Conductore("1234567", "pablo");
		v1.setAutobus(a1);
		v1.setConductor(c1);
		v1.setLugar(l1);
		v2.setAutobus(a1);
		v2.setConductor(c1);
		v2.setLugar(l1);
		List<Visita> visitas= new ArrayList<>();
		visitas.add(v1);
		visitas.add(v2);
		a1.setVisitas(visitas);
/*		c1.setVisitas(visitas);
		l1.setVisitas(visitas);*/
		System.out.println(conductorServicio.insertar(c1));
		System.out.println(lugarServicio.insertar(l1));

		System.out.println(autobusServicio.insertar(a1));
		System.out.println(autobusServicio.obtenerTodos());

	}
}
