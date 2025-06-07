import {Component} from '@angular/core';
import {FormBuilder, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {HttpClient} from "@angular/common/http";
import {RouterOutlet} from "@angular/router";
import {MatFormField, MatLabel} from "@angular/material/form-field";
import {MatInput} from "@angular/material/input";
import {MatButton} from "@angular/material/button";
import {NgIf} from "@angular/common";
import {MatCard, MatCardContent, MatCardHeader, MatCardTitle} from "@angular/material/card";

@Component({
  selector: 'app-scoring',
  standalone: true,
  imports: [
    RouterOutlet,
    ReactiveFormsModule,
    MatFormField,
    MatInput,
    MatButton,
    MatLabel,
    NgIf,
    MatCard,
    MatCardHeader,
    MatCardContent,
    MatCardTitle,
  ],
  templateUrl: './scoring.component.html',
  styleUrl: './scoring.component.scss'
})
export class ScoringComponent {
  form: FormGroup;
  scoreResult: number | null = null;

  constructor(private fb: FormBuilder, private http: HttpClient) {
    this.form = this.fb.group({
      loanAmount: [null, [Validators.required, Validators.min(0)]],
      loanTermMonths: [null, [Validators.required, Validators.min(1)]],
      interestRate: [null, [Validators.required, Validators.min(0)]],
      income: [null, [Validators.required, Validators.min(0)]],
      expenses: [null, [Validators.required, Validators.min(0)]],
      age: [null, [Validators.required, Validators.min(18)]],
      numberOfDependants: [null, [Validators.required, Validators.min(0)]]
    });
  }

  submit() {
    if (this.form.valid) {
      this.http.post<any>('/api/score', this.form.value)
        .subscribe({
          next: (res) => this.scoreResult = res.score,
          error: (err) => console.error('API error:', err)
        });
    }
  }
}
