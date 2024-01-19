package ru.sanctio.datageneratormicro.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.kafka.sender.KafkaSender;
import ru.sanctio.datageneratormicro.model.Data;

@Service
@RequiredArgsConstructor
public class KafkaDataServiceImpl implements KafkaDataService{

    private final KafkaSender<String, Object> kafkaSender;

    @Override
    public void send(Data data) {

    }
}
