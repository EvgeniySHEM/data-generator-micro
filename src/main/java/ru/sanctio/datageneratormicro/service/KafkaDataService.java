package ru.sanctio.datageneratormicro.service;

import ru.sanctio.datageneratormicro.model.Data;

public interface KafkaDataService {

    void send(Data data);

}
