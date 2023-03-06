export const mapInputTypeToFieldType =  (t: string):string => {
    switch (t) {
        case 'string': return 'field-text';
        case 'long': return 'field-number';
        case 'enum': return 'field-enum';
        case 'boolean': return 'field-boolean';
    }
    return 'field-text'
}
