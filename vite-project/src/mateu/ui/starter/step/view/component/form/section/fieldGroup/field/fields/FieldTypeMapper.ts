export const mapInputTypeToFieldType =  (type: string, stereotype: string):string => {

    if (stereotype.startsWith('custom:')) {
        return stereotype.substring('custom:'.length)
    }

    if (stereotype.startsWith('element:')) {
        return stereotype.substring('element:'.length)
    }
    if (type == 'boolean' && stereotype == 'radiobuttons') {
        return 'field-boolean-radio-buttons';
    }
    switch (stereotype) {
        case 'readonly': return 'field-readonly';
        case 'textarea': return 'field-textarea';
        case 'radiobuttons': return 'field-radio-buttons';
        case 'toggle': return 'field-toggle';
        case 'combobox': return 'field-combobox';
        case 'file': return 'field-file';
        case 'closedlist': return 'field-closedlist';
        case 'externalref-closedlist': return 'field-externalref-checkboxes';
        case 'rawcontent': return 'field-rawcontent';
    }
    switch (type) {
        case 'string': return 'field-text';
        case 'long': return 'field-number';
        case 'int': return 'field-number';
        case 'double': return 'field-double';
        case 'enum': return 'field-radio-buttons';
        case 'boolean': return 'field-boolean';
        case 'date': return 'field-date';
        case 'datetime': return 'field-datetime';
        case 'time': return 'field-time';
        case 'file': return 'field-file';
        case 'ExternalReference': return 'field-externalref';
        case 'boolean[]': return 'field-boolean-array';
        case 'int[]': return 'field-int-array';
        case 'double[]': return 'field-double-array';
        case 'string[]': return 'field-string-array';
        case 'enum[]': return 'field-enum-array';
        case 'ExternalReference[]': return 'field-externalref-array';
        case 'URL': return 'field-url';
        case 'Stepper': return 'field-stepper';
    }
    return 'field-object'
}
