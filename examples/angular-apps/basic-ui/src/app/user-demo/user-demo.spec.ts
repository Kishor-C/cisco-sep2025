import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UserDemo } from './user-demo';

describe('UserDemo', () => {
  let component: UserDemo;
  let fixture: ComponentFixture<UserDemo>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [UserDemo]
    })
    .compileComponents();

    fixture = TestBed.createComponent(UserDemo);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
