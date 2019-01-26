import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HometoComponent } from './hometo.component';

describe('HometoComponent', () => {
  let component: HometoComponent;
  let fixture: ComponentFixture<HometoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HometoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HometoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
