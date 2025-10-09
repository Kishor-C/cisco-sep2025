import { ComponentFixture, TestBed } from '@angular/core/testing';

import { MdfDemo } from './mdf-demo';

describe('MdfDemo', () => {
  let component: MdfDemo;
  let fixture: ComponentFixture<MdfDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [MdfDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(MdfDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
