package it.uniroma3.GalleriaArte.service;

import it.uniroma3.GalleriaArte.model.Opera;



public interface OperaService {
    Iterable<Opera> listAllOpere();

    Opera getOperaById(Long id);

     Opera saveOpera(Opera opera);

    void deleteOpera(Long id);
}