package com.guia2tc100321.service;

import java.util.List;
import models.trip;

public interface ITripService {

    List<trip> BuscarTodos();

    trip buscarPorId(Integer idTrip);
}
