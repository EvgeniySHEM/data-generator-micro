package ru.sanctio.datageneratormicro.service;

import ru.sanctio.datageneratormicro.model.test.DataTestOptions;

public interface TestDataService {

    void sendMessages(DataTestOptions testOptions);

}
