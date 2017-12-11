package com.springframework.services;

import com.springframework.commands.UnitOfMeasureCommand;
import reactor.core.publisher.Flux;

/**
 * Created by  Harish on 6/28/17.
 */
public interface UnitOfMeasureService {

    Flux<UnitOfMeasureCommand> listAllUoms();
}
