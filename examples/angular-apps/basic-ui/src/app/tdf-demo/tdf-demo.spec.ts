import { ComponentFixture, TestBed } from '@angular/core/testing';

import { TdfDemo } from './tdf-demo';

describe('TdfDemo', () => {
  let component: TdfDemo;
  let fixture: ComponentFixture<TdfDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [TdfDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(TdfDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
