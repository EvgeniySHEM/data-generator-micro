package ru.sanctio.datageneratormicro.model.test;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sanctio.datageneratormicro.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptions {

    private int delayInSeconds;

    private Data.MeasurementType[] measurementTypes;

}
