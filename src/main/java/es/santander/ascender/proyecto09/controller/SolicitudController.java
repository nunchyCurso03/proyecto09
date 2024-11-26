package es.santander.ascender.proyecto09.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import es.santander.ascender.proyecto09.Solicitud;

@RestController
@RequestMapping("/solicitud")
public class SolicitudController {

    @PostMapping
    public long crear (@RequestBody Solicitud solicitud) throws Exception{
       if (solicitud.getId() != 0){
            throw new Exception("Al crear no me puedes pasar el id");
       }
       return 16;
        //throw new UnsupportedOperationException("Pdte");
    }
    @GetMapping("/{id}")
    public Solicitud leer(@PathVariable ("id")long id) {
        Solicitud respuesta = new Solicitud();
        //throw new UnsupportedOperationException("Pdte");
        respuesta.setId(id);
        respuesta.setNombre("Juan");
        respuesta.setEdad(28);

        return respuesta;
    }

    @GetMapping
    public List<Solicitud> listar() {
        List <Solicitud> resultado = new ArrayList<>();

         
         for(int i = 3; i <=15; i+= 3){
            Solicitud respuesta = new Solicitud();
           
            respuesta.setId(i);
            respuesta.setNombre("Juan" + i);
            respuesta.setEdad(28 + 1);
            resultado.add(respuesta);  
             
         }
      return resultado;
    }


    @PutMapping
    public void modificar(Solicitud solicitud) throws Exception {
        if (solicitud.getId() == 0){
            throw new Exception("Al modificar me tienes pasar el id");
    }
}



    @DeleteMapping
    public void borrar(@PathVariable ("id") long id){

        //throw new UnsupportedOperationException("Pdte");
    }
}
