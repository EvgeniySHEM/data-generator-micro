package ru.sanctio.datageneratormicro.web.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import ru.sanctio.datageneratormicro.model.Data;

@NoArgsConstructor
@Getter
@Setter
public class DataTestOptionsDto {

    private int delayInSeconds;

    private Data.MeasurementType[] measurementTypes;

}
