package com.controller;

import com.model.Planta;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "PlantaController")
@ViewScoped
public class PlantaController implements Serializable {

    private final Planta planta1 = new Planta("Sábila", "Aloe Vera", "Mata", "Asfodeláceas", "Planta Suculenta",
                "Aloe", "Verde Brillante", "África, Madagascar", "Liliopsida", "Magnoliophyta", 1);
    private final Planta planta2 = new Planta("Orégano", "Origanum Vulgare", "Arbusto", "Lamiaceae", "Vulgare", "Origanum",
                "Verde, blanco, rojo", "Zona Mediterranea", "Magnoliopsida", "Magnoliophyta", 2);
    private final Planta planta3 = new Planta("Venus Atrapamoscas", "Dionaea Muscipula", "Carnivora", "Droseraceae", "Dionaea Muscipula",
            "Dionaea", "Verde, Rojo, Blanco", "Estados Unidos", "Magnoliopsida", "Magnoliophyta", 3);
    private final Planta planta4 = new Planta("Aro Gigante", "Amorphophallus Titanum", "Hierba", "Araceae", "A. Titanum", 
            "Amorphophallus", "Verde, Violeta, Roja, Amarilla, Blanca", "Indonesia", "Liliopsida", "Magnoliophyta", 4);
    private final Planta planta5 = new Planta("Pringamosa", "Urtica Dioica", "Arbusto", "Urticaceae", "U. dioica", "Urtica",
            "Verde Palido", "Asia, America", "Magnoliopsida", "Magnoliophyta", 5);

    private List<Planta> listaPlantas = new LinkedList();
    private List<Planta> listaPlantas2 = new LinkedList();

    /**
     * Creates a new instance of PlantaController
     */
    public PlantaController() {
        listaPlantas.add(planta1);
        listaPlantas.add(planta2);
        listaPlantas.add(planta3);
        listaPlantas.add(planta4);
        listaPlantas.add(planta5);
    }

    public List<Planta> getListaPlantas() {
        return listaPlantas;
    }

    public void setListaPlantas(List<Planta> listaPlantas) {
        this.listaPlantas = listaPlantas;
    }
    
    public void quemarPlanta(Planta p) {
        listaPlantas2.add(p);
        getListaPlantas().remove(p);
    }
    
    public List<Planta> getListaPlantas2() {
        return listaPlantas2;
    }
    
    public void botonVolver() {
        getListaPlantas2().removeAll(listaPlantas2);
    }
    
}
