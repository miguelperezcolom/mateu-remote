export const mapInputTypeToFieldType =  (type: string, stereotype: string):string => {
    switch (stereotype) {
        case 'readonly': return 'field-readonly';
        case 'textarea': return 'field-textarea';
        case 'radiobuttons': return 'field-radiobuttons';
        case 'toggle': return 'field-toggle';
        case 'combobox': return 'field-combobox';
        case 'file': return 'field-file';
    }
    switch (type) {
        case 'string': return 'field-text';
        case 'long': return 'field-number';
        case 'int': return 'field-number';
        case 'double': return 'field-double';
        case 'enum': return 'field-radiobuttons';
        case 'boolean': return 'field-boolean';
        case 'date': return 'field-date';
        case 'datetime': return 'field-datetime';
        case 'time': return 'field-time';
        case 'file': return 'field-file';
        case 'ExternalReference': return 'field-externalref';
    }
    return 'field-text'
}
