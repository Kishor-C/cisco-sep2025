import { ComponentFixture, TestBed } from '@angular/core/testing';

import { Parent1 } from './parent1';

describe('Parent1', () => {
  let component: Parent1;
  let fixture: ComponentFixture<Parent1>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [Parent1]
    })
    .compileComponents();

    fixture = TestBed.createComponent(Parent1);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
