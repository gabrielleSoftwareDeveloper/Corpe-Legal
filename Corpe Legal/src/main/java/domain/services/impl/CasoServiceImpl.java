package domain.services.impl;

import dao.impl.DaoCasoImpl;
import domain.model.Caso;
import jakarta.inject.Inject;

public class CasoServiceImpl {

    private DaoCasoImpl daoCaso;

    @Inject
    public CasoServiceImpl(DaoCasoImpl daoCaso) {
        this.daoCaso = daoCaso;
    }

    public Caso getCaso(int id) {
        return daoCaso.getCaso(id);
    }
}
