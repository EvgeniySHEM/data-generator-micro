package ru.sanctio.datageneratormicro.web.mapper;

import org.mapstruct.Mapper;
import ru.sanctio.datageneratormicro.model.test.DataTestOptions;
import ru.sanctio.datageneratormicro.web.dto.DataTestOptionsDto;

@Mapper(componentModel = "spring")
public interface DataTestOptionsMapper
        extends Mappable<DataTestOptions, DataTestOptionsDto> {

}
