package ru.sanctio.datageneratormicro.web.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sanctio.datageneratormicro.model.Data;
import ru.sanctio.datageneratormicro.model.test.DataTestOptions;
import ru.sanctio.datageneratormicro.service.KafkaDataService;
import ru.sanctio.datageneratormicro.service.TestDataService;
import ru.sanctio.datageneratormicro.web.dto.DataDto;
import ru.sanctio.datageneratormicro.web.dto.DataTestOptionsDto;
import ru.sanctio.datageneratormicro.web.mapper.DataMapper;
import ru.sanctio.datageneratormicro.web.mapper.DataTestOptionsMapper;

@RestController
@RequestMapping("/api/v1/data")
@RequiredArgsConstructor
public class DataController {

    private final KafkaDataService kafkaDataService;
    private final TestDataService testDataService;

    private final DataMapper dataMapper;
    private final DataTestOptionsMapper dataTestOptionsMapper;

    @PostMapping("/send")
    public void send(@RequestBody DataDto dto) {
        Data data = dataMapper.toEntity(dto);
        kafkaDataService.send(data);
    }

    @PostMapping("/test/send")
    public void testSend(@RequestBody DataTestOptionsDto testOptionsDto) {
        DataTestOptions testOptions = dataTestOptionsMapper.toEntity(testOptionsDto);
        testDataService.sendMessages(testOptions);

    }

}
