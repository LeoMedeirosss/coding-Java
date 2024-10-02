package util;

import java.util.List;
import java.util.Map;
import ong.Ong;
import doador.Doacao;
import doador.Doador;
import eventos.Evento;

public interface SistemaGestaoOngs {
   
    void realizarDoacao(Doacao doacao);
    void cancelarDoacao(Doacao doacao);
    List<Doacao> listarDoacoes();
    
  
    void adicionarEvento(Ong ong, Evento evento);
    void removerEvento(Ong ong, Evento evento);
    List<Evento> listarEventos();
    
   
    void cadastrarOng(Ong ong);
    void removerOng(Ong ong);
    List<Ong> listarOngs();
    
 
    List<Doador> listarMaioresDoadores(int quantidade);
    List<Ong> listarOngsMaisFavoritadas(int quantidade);
   
   
   Map<String, Integer> dadosOngsPopulares(int quantidade);
}
