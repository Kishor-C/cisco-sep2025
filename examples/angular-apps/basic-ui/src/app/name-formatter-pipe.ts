import { Pipe, PipeTransform } from '@angular/core';

@Pipe({
  name: 'nameFormatter',
  standalone: false
})
export class NameFormatterPipe implements PipeTransform {

  // {{ emp.firstname | nameFormatter : emp.gender}} - value = firstname, args[0] = gender
  transform(value: string, ...args: string[]): string {
    let gender = args[0]?.charAt(0);
    if(gender == 'M' || gender == 'm') {
      return 'Mr. '+value;
    } else if(gender == 'F' || gender == 'f'){
      return 'Ms. '+value;
    } else {
      return value;
    }
  }

}
