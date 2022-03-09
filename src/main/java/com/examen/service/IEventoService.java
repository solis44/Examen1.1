
package com.examen.service;


import com.examen.entity.Evento;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public interface IEventoService {

    public List<Evento> getEvento();
    public void saveEvento(Evento evento);
    public Evento findEvento(Evento evento);
    public void deleteEvento(Evento evento);

    public Evento find(Evento evento);

    public void deleteEvento(Long idEvento);

}