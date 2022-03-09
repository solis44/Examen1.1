
package com.examen.service;


import com.examen.entity.Evento;
import com.examen.repository.EventoRepository;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService implements IEventoService{
    @Autowired  
    private EventoRepository eventoRepository;
    
    @Override   
    @Transactional(readOnly=true)
    public List<Evento> getEvento() {
        return(List<Evento>)eventoRepository.findAll();
    }

    @Override
    @Transactional
    public void saveEvento(Evento evento) {
        eventoRepository.save(evento);
    }
     @Override
     @Transactional
    public void deleteEvento(Evento evento) {
       eventoRepository.delete(evento);
    }


    @Override
    @Transactional
    
  
    public Evento find(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void deleteEvento(Long idEvento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Evento findEvento(Evento evento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
  
}