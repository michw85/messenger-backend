import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;
import java.util.List;

@Converter
public class JsonToListConverter implements AttributeConverter<List<String>, String> {

    private static final ObjectMapper mapper = new ObjectMapper();

    @Override
    @SneakyThrows
    public String convertToDatabaseColumn(List<String> attribute) {
        return mapper.writeValueAsString(attribute);
    }

    @Override
    @SneakyThrows
    public List<String> convertToEntityAttribute(String dbData) {
        if (dbData == null) return List.of();
        return mapper.readValue(dbData, new TypeReference<List<String>>() {});
    }
}