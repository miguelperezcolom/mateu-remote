export const mapInputTypeToFieldType =  (type: string, stereotype: string):string => {
    switch (stereotype) {
        case 'readonly': return 'field-readonly';
        case 'textarea': return 'field-textarea';
    }
    switch (type) {
        case 'string': return 'field-text';
        case 'long': return 'field-number';
        case 'int': return 'field-number';
        case 'double': return 'field-double';
        case 'enum': return 'field-enum';
        case 'boolean': return 'field-boolean';
        case 'date': return 'field-date';
        case 'datetime': return 'field-datetime';
        case 'time': return 'field-time';
    }
    return 'field-text'
}
